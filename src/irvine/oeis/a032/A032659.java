package irvine.oeis.a032;

/**
 * A032659 Lucky numbers that are concatenations of n with <code>n + 9</code>.
 * @author Sean A. Irvine
 */
public class A032659 extends A032650 {

  @Override
  protected int addend() {
    return 9;
  }
}
