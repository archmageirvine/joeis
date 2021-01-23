package irvine.oeis.a032;

/**
 * A032656 Lucky numbers that are decimal concatenations of n with n + 6.
 * @author Sean A. Irvine
 */
public class A032656 extends A032650 {

  @Override
  protected int addend() {
    return 6;
  }
}
