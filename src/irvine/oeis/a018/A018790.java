package irvine.oeis.a018;

/**
 * A018790 Number of subsets of { 1, ..., n } containing an A.P. of length 5.
 * @author Sean A. Irvine
 */
public class A018790 extends A018794 {

  @Override
  protected int ap() {
    return 5;
  }
}
