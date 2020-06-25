package irvine.oeis.a032;

/**
 * A032651 Lucky numbers that are decimal concatenations of n with <code>n + 1</code>.
 * @author Sean A. Irvine
 */
public class A032651 extends A032650 {

  @Override
  protected int addend() {
    return 1;
  }
}
