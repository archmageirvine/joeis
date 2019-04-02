package irvine.oeis.a018;

/**
 * A018789 Number of subsets of { 1, ..., n } containing an A.P. of length 4.
 * @author Sean A. Irvine
 */
public class A018789 extends A018794 {

  @Override
  protected int ap() {
    return 4;
  }
}
