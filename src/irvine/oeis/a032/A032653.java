package irvine.oeis.a032;

/**
 * A032653 Lucky numbers that are decimal concatenations of n with n + 3.
 * @author Sean A. Irvine
 */
public class A032653 extends A032650 {

  @Override
  protected int addend() {
    return 3;
  }
}
