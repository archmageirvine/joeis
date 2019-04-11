package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087161 Records in A087159: A087159(a(n))=n and satisfies recurrence: <code>a(n+3)=5a(n+2)-6a(n+1)+2a(n),</code> with <code>a(1)=1, a(2)=2, a(3)=4</code>.
 * @author Sean A. Irvine
 */
public class A087161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087161() {
    super(new long[] {2, -6, 5}, new long[] {1, 2, 4});
  }
}
