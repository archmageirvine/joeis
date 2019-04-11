package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127934 <code>a(8n)=8n+1, a(8n+1)=a(8n+2)=a(8n+3)=8n+5, a(8n+4)=8n+6, a(8n+5)=a(8n+6)=a(8n+7)=8n+8</code>.
 * @author Sean A. Irvine
 */
public class A127934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127934() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 5, 5, 6, 8, 8, 8, 9});
  }
}
