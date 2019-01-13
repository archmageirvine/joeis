package irvine.oeis.a085;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085589.
 * @author Sean A. Irvine
 */
public class A085589 implements Sequence {

  protected int mN = 2;

  private byte mod3(final byte a, final byte b) {
    return (byte) ((0b0100100100 >> ((a + b) << 1)) & 3);
//    final int v = a + b;
//    return (byte) (v >= 3 ? v - 3 : v);
  }

  protected byte[] step(final byte[] state) {
    final byte[] res = new byte[state.length];
    res[0] = mod3(state[state.length - 1], state[1]);
    for (int k = 1; k < state.length - 1; ++k) {
      res[k] = mod3(state[k - 1], state[k + 1]);
    }
    res[state.length - 1] = mod3(state[state.length - 2], state[0]);
    return res;
  }

  private long getPeriod() {
    // Find a starting state somewhere on a cycle
    byte[] state = new byte[mN];
    state[0] = 1;
    byte[] kangaroo = step(state);
    while (!Arrays.equals(kangaroo, state)) {
      state = step(state);
      kangaroo = step(step(kangaroo));
    }
    // Count the length of the cycle
    long period = 0;
    do {
      kangaroo = step(kangaroo);
      ++period;
    } while (!Arrays.equals(kangaroo, state));
    return period;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(getPeriod());
  }

}
