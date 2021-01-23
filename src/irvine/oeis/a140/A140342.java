package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140342 a(n)=5a(n-1)-11a(n-2)+13a(n-3)-9a(n-4)+3a(n-5)-a(n-6).
 * @author Sean A. Irvine
 */
public class A140342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140342() {
    super(new long[] {-1, 3, -9, 13, -11, 5}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
