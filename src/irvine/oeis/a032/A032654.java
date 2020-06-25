package irvine.oeis.a032;

/**
 * A032654 Lucky numbers that are concatenations of n with <code>n + 4</code>.
 * @author Sean A. Irvine
 */
public class A032654 extends A032650 {

  @Override
  protected int addend() {
    return 4;
  }
}
