package irvine.oeis.a085;

/**
 * A085591.
 * @author Sean A. Irvine
 */
public class A085591 extends A085590 {

  @Override
  protected byte mod3(final byte a, final byte b, final byte c) {
    return (byte) ((0b100100100100100100 >> ((a + b + b + c) << 1)) & 3);
  }
}
