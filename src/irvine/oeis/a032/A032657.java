package irvine.oeis.a032;

/**
 * A032657 Lucky numbers that are decimal concatenations of n with n + 7.
 * @author Sean A. Irvine
 */
public class A032657 extends A032650 {

  @Override
  protected int addend() {
    return 7;
  }
}
