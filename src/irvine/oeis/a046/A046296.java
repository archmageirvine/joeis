package irvine.oeis.a046;

/**
 * A046296 Numbers k such that 2^k contains 2^10 = 1024 as its largest proper substring of the form 2^m.
 * @author Sean A. Irvine
 */
public class A046296 extends A046287 {

  @Override
  protected int target() {
    return 9;
  }
}
