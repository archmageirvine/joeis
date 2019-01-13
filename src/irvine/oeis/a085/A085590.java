package irvine.oeis.a085;

/**
 * A085590.
 * @author Sean A. Irvine
 */
public class A085590 extends A085589 {

  protected byte mod3(final byte a, final byte b, final byte c) {
    return (byte) ((0b100100100100100100 >> ((a + b + c) << 1)) & 3);
    //return (byte) ((a + b + c) % 3);
  }

  @Override
  protected byte[] step(final byte[] state) {
    final byte[] res = new byte[state.length];
    res[0] = mod3(state[state.length - 1], state[0], state[1]);
    for (int k = 1; k < state.length - 1; ++k) {
      res[k] = mod3(state[k - 1], state[k], state[k + 1]);
    }
    res[state.length - 1] = mod3(state[state.length - 2], state[state.length - 1], state[0]);
    return res;
  }
}
