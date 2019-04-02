package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204644 Number of (n+1)X2 0..1 arrays with column and row pair sums b(i,j)=a(i,j)+a(i,j-1) and c(i,j)=a(i,j)+a(i-1,j) nondecreasing in column and row directions, respectively.
 * @author Sean A. Irvine
 */
public class A204644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204644() {
    super(new long[] {-1, 0, 2}, new long[] {8, 16, 28});
  }
}
