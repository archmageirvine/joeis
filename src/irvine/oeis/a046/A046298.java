package irvine.oeis.a046;

/**
 * A046298 Numbers k such that 2^k contains 2^12=4096 as its largest proper substring of the form 2^m.
 * @author Sean A. Irvine
 */
public class A046298 extends A046287 {

  @Override
  protected int target() {
    return 11;
  }
}
