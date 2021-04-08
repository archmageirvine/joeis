package irvine.oeis.a046;

/**
 * A046295 Numbers k such that 2^k contains 2^9=512 as its largest proper substring of the form 2^m.
 * @author Sean A. Irvine
 */
public class A046295 extends A046287 {

  @Override
  protected int target() {
    return 8;
  }
}
