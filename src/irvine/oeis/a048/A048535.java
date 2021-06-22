package irvine.oeis.a048;

/**
 * A048535 a(n) is the smallest value of m such that A002378(m), the m-th oblong number, contains exactly n 3's.
 * @author Sean A. Irvine
 */
public class A048535 extends A048529 {

  @Override
  protected int digit() {
    return 3;
  }
}
