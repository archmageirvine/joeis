package irvine.oeis.a085;

/**
 * A085594.
 * @author Sean A. Irvine
 */
public class A085594 extends A085593 {

  @Override
  protected byte mod4(final byte a, final byte b, final byte c) {
    return (byte) ((a + b + b + c) & 3);
  }
}
