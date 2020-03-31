package irvine.oeis.a030;

/**
 * A030327 <code>a(n)=least</code> k such that base 2 representation of n begins at <code>s(k)</code> in <code>A030324</code>.
 * @author Sean A. Irvine
 */
public class A030327 extends A030320 {

  /** Construct the sequence. */
  public A030327() {
    super(new A030324(), 0);
  }
}

