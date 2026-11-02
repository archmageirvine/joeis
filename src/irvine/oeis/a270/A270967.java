package irvine.oeis.a270;
// manually 2026-10-31/lambdan at 2026-10-31 

import irvine.oeis.LambdaSequence;

/**
 * A270967 Number of set partitions of [n] having the maximal possible number of pairs (m,m+1) such that m+1 is in some block b and m is in block b+1.
 * @author Georg Fischer
 */
public class A270967 extends LambdaSequence {

  private static final A270953 mSeq = new A270953();

  /** Construct the sequence. */
  public A270967() {
    super(0, n -> {
      mSeq.a(n, 0);
      return mSeq.a(n, mSeq.getColumnRange(Math.toIntExact(n))[1]);
    });
  }
}
