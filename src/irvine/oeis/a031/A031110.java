package irvine.oeis.a031;

/**
 * A031110 <code>a(n)=least</code> k such that base 9 representation of n begins at <code>s(k)</code>, where <code>s=A031100</code>.
 * @author Sean A. Irvine
 */
public class A031110 extends A031086 {

  /** Construct the sequence. */
  public A031110() {
    super(new A031100(), 0);
  }
}

