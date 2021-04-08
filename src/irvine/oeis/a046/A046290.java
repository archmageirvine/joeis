package irvine.oeis.a046;

/**
 * A046290 Numbers k such that 2^k contains 2^4=16 as its largest proper substring of the form 2^m (probably finite).
 * @author Sean A. Irvine
 */
public class A046290 extends A046287 {

  @Override
  protected int target() {
    return 3;
  }
}
