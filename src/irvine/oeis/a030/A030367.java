package irvine.oeis.a030;

/**
 * A030367 <code>a(n)=least</code> k such that base 3 representation of n begins at <code>s(k)</code>, where <code>s=A030363</code>.
 * @author Sean A. Irvine
 */
public class A030367 extends A030335 {

  /** Construct the sequence. */
  public A030367() {
    super(new A030363(), 0);
  }
}

