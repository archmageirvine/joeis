package irvine.oeis.a353;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353311 Number of distinct terms in the orbit under iteration of A353313.
 * @author Gregory Morse
 */
public class A353311 extends LambdaSequence {
  private static final int LIMIT = 10000;

  /** Construct the sequence. */
  public A353311() {
    super(0, n -> Z.valueOf(orbit(Z.valueOf(n)).mPositions.size()));
  }

  static final class Orbit {
    private final Map<Z, Integer> mPositions;
    private final int mStart;

    private Orbit(final Map<Z, Integer> positions, final int start) {
      mPositions = positions;
      mStart = start;
    }

    int cycleLength() {
      return mPositions.size() - mStart;
    }

    int tailLength() {
      return mStart;
    }

    Stream<Z> afterFirst() {
      // If the cycle starts at the input, the input is reached again.
      return mPositions.keySet().stream().skip(mStart == 0 ? 0 : 1);
    }
  }

  static Orbit orbit(final Z n) {
    final Map<Z, Integer> positions = new LinkedHashMap<>();
    Z t = n;
    for (int k = 0; k <= LIMIT; ++k) {
      final Integer first = positions.putIfAbsent(t, k);
      if (first != null) {
        return new Orbit(positions, first);
      }
      t = A353313.step(t);
    }
    throw new UnsupportedOperationException("Orbit unresolved within the iteration limit");
  }
}
