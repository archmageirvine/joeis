package irvine.oeis.a046;

/**
 * A046289 Numbers k such that 2^k contains 2^3=8 as its largest proper substring of the form 2^m (probably finite).
 * @author Sean A. Irvine
 */
public class A046289 extends A046287 {

  @Override
  protected int target() {
    return 2;
  }
}
