package irvine.oeis.a032;

/**
 * A032658 Lucky numbers that are decimal concatenations of n with <code>n + 8</code>.
 * @author Sean A. Irvine
 */
public class A032658 extends A032650 {

  @Override
  protected int addend() {
    return 8;
  }
}
