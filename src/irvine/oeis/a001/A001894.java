package irvine.oeis.a001;

/**
 * A001894 Number of permutations of {1,...,n} having n-4 inversions (n&gt;=4).
 * @author Sean A. Irvine
 */
public class A001894 extends A001892 {

  @Override
  protected int delta() {
    return 3;
  }
}
