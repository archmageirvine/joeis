package irvine.oeis.a032;

/**
 * A032652 Lucky numbers that are concatenations of n with <code>n + 2</code>.
 * @author Sean A. Irvine
 */
public class A032652 extends A032650 {

  @Override
  protected int addend() {
    return 2;
  }
}
