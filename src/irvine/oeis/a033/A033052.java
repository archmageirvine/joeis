package irvine.oeis.a033;

/**
 * A033052 a(1) = 1, a(2n) = 16a(n), a(2n+1) = a(2n)+1.
 * @author Sean A. Irvine
 */
public class A033052 extends A033042 {

  @Override
  protected int base() {
    return 16;
  }
}
