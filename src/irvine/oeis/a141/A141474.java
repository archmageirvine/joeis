package irvine.oeis.a141;

import java.util.Comparator;
import java.util.Map;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a060.A060843;

/**
 * A141474 Concatenated and flattened output distributions of the Turing machines described in the comments lines.
 * @author Gregory Morse
 */
public class A141474 extends Sequence0 {
  private final A060843 mBound = new A060843();
  private int mStates = 0;
  private String mRow = "";
  private int mK = 0;

  @Override
  public Z next() {
    if (mK == mRow.length()) {
      if (++mStates > 4) {
        throw new UnsupportedOperationException("Higher-state output distributions not generated");
      }
      final StringBuilder row = new StringBuilder();
      // The published b-file breaks frequency ties by length, then lexicographically.
      BlankTapeHalting.outputs(mStates, mBound.a(mStates).intValueExact()).entrySet().stream()
        .sorted(Map.Entry.<String, Z>comparingByValue(Comparator.reverseOrder())
          .thenComparingInt(entry -> entry.getKey().length()).thenComparing(Map.Entry.comparingByKey()))
        .forEach(entry -> row.append(entry.getKey()));
      mRow = row.toString();
      mK = 0;
    }
    return Z.valueOf(mRow.charAt(mK++) - '0');
  }
}
