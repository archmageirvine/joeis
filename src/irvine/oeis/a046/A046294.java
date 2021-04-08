package irvine.oeis.a046;

/**
 * A046294 Numbers k such that 2^k contains 2^8=256 as its largest proper substring of the form 2^m.
 * @author Sean A. Irvine
 */
public class A046294 extends A046287 {

  @Override
  protected int target() {
    return 7;
  }
}
