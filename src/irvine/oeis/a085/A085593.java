package irvine.oeis.a085;

/**
 * A085593 Maximal cycle lengths in a certain class of one-dimensional cellular automata.
 * @author Sean A. Irvine
 */
public class A085593 extends A085589 {

  protected byte mod4(final byte a, final byte b, final byte c) {
    return (byte) ((a + b + c) & 3);
  }

  @Override
  protected byte[] step(final byte[] state) {
    final byte[] res = new byte[state.length];
    res[0] = mod4(state[state.length - 1], state[0], state[1]);
    for (int k = 1; k < state.length - 1; ++k) {
      res[k] = mod4(state[k - 1], state[k], state[k + 1]);
    }
    res[state.length - 1] = mod4(state[state.length - 2], state[state.length - 1], state[0]);
    return res;
  }
}
