package irvine.oeis.a001;

/**
 * A001893 Number of permutations of (1,...,n) having n-3 inversions (n&gt;=3).
 * @author Sean A. Irvine
 */
public class A001893 extends A001892 {

  @Override
  protected int delta() {
    return 2;
  }
}
