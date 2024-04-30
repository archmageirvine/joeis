package irvine.oeis.a069;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * A069363 Number of 5 X n binary arrays with a path of adjacent 1's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069363 extends A069295 {

  private int mN = 0;

  /** Construct the sequence. */
  public A069363() {
    super(1);
  }

  @Override
  protected Map<State, Z> initial(final int rows) {
    final HashMap<State, Z> res = new HashMap<>();
    for (long s = 1; s < 1L << rows; ++s) {
      final byte[] lst = new byte[rows];
      long t = s;
      for (int r = 0; r < rows; ++r, t >>>= 1) {
        if ((t & 1) == 1) {
          lst[r] = 1;
        }
      }
      res.put(new State(lst), Z.ONE);
    }
    return res;
  }

  @Override
  public Z next() {
    return count(++mN, 5);
  }
}
