package irvine.oeis.a099;

import irvine.oeis.FiniteSequence;

/**
 * A099182 <code>a[n]</code> is the smallest prime built up using the sets of digits <code>{0,1},{0,1,2},</code>...,{0,1,2,3,4,5,6,7,8,9}.
 * @author Georg Fischer
 */
public class A099182 extends FiniteSequence {

  /** Construct the sequence. */
  public A099182() {
    super(101, 1021, 10223, 10243, 1015423, 10152463, 10235647, 1012356487L, 10123457689L);
  }
}
