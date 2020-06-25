package irvine.oeis.a032;

/**
 * A032655 Lucky numbers that are decimal concatenations of n with <code>n + 5</code>.
 * @author Sean A. Irvine
 */
public class A032655 extends A032650 {

  @Override
  protected int addend() {
    return 5;
  }
}
