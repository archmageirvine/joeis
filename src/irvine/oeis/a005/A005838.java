package irvine.oeis.a005;

/**
 * A005838 Lexicographically earliest increasing sequence of positive numbers that contains no arithmetic progression of length 6.
 * @author Sean A. Irvine
 */
public class A005838 extends A005837 {

  @Override
  protected int limit() {
    return 6;
  }
}
