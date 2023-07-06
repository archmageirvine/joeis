package irvine.oeis.a031;

/**
 * A031335 a(n)=least k such that n begins at s(k), where s=A031324.
 * @author Sean A. Irvine
 */
public class A031335 extends A031297 {

  /** Construct the sequence. */
  public A031335() {
    super(new A031324().skip(2), 0);
  }
}

