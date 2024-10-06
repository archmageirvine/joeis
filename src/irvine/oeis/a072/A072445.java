package irvine.oeis.a072;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A072445 Number of subsets S of the power set P{1,2,...,n} such that: {1}, {2},..., {n} are all elements of S; {1,2,...,n} is an element of S; if X and Y are elements of S and X and Y have a nonempty intersection, then the union of X and Y is an element of S. The sets S are counted modulo permutations on the elements 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A072445 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A072445() {
    super(0, new A072444(), 1);
  }
}
