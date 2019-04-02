package irvine.oeis.a085;

/**
 * A085592 Maximal cycle lengths in a certain class of one-dimensional cellular automata.
 * @author Sean A. Irvine
 */
public class A085592 extends A085589 {

  private byte mod4(final byte a, final byte b) {
    return (byte) ((a + b) & 3);
  }

  @Override
  protected byte[] step(final byte[] state) {
    final byte[] res = new byte[state.length];
    res[0] = mod4(state[state.length - 1], state[1]);
    for (int k = 1; k < state.length - 1; ++k) {
      res[k] = mod4(state[k - 1], state[k + 1]);
    }
    res[state.length - 1] = mod4(state[state.length - 2], state[0]);
    return res;
  }
}
