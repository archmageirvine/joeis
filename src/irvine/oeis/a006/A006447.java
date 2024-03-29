package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a170.A170896;
import irvine.util.Pair;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A006447 Consider a 2-D cellular automaton generated by the Schrandt-Ulam rule of A170896, but confined to a semi-infinite strip of width n, starting with one ON cell at the top left corner; a(n) is the period of the resulting structure.
 * @author Sean A. Irvine
 */
public class A006447 extends A170896 {

  /** Construct the sequence. */
  public A006447() {
    super(1);
  }

  private int mN = 0;

  @Override
  protected boolean accept(final Pair<Integer, Integer> pt) {
    return pt.left() >= 0 && pt.right() >= 0 && pt.right() < mN;
  }

  @Override
  public Z next() {
    mN++;
    reset();
    // Might be better to convert each column of image into an integer and look for period of that sequence
    final LongDynamicBooleanArray[] plane = new LongDynamicBooleanArray[mN];
    for (int k = 0; k < mN; ++k) {
      plane[k] = new LongDynamicBooleanArray();
    }
    int iter = -1;
    for (int k = 0; k < 2 * mN; ++k) {
      // A little initial run up before we even begin looking
      stepAutomata(plane);
    }
    while (true) {
      ++iter;
      stepAutomata(plane);
      for (int period = 1; period < iter; ++period) {
        boolean ok = true;
        final int start = iter / 2;
        for (int i = 0; i < mN; ++i) {
          if (plane[i].isSet(start) != plane[i].isSet(start + period) || plane[i].isSet(start) != plane[i].isSet(start + 2L * period)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          // Do a more careful check
          for (int s = start + 1; s < period; ++s) {
            for (int i = 0; i < mN; ++i) {
              if (plane[i].isSet(start) != plane[i].isSet(start + period)) {
                ok = false;
                break;
              }
            }
          }
          if (ok) {
            return Z.valueOf(period);
          }
        }
      }
    }
  }

  private void stepAutomata(final LongDynamicBooleanArray[] plane) {
    super.next();
    for (final Pair<Integer, Integer> pt : mNewlyOn) {
      plane[pt.right()].set(pt.left());
    }
  }
}
