package irvine.oeis.a031;

/**
 * A031275 a(n)=least k such that the base 5 representation of n begins at s(k), where s=A031269.
 * @author Sean A. Irvine
 */
public class A031275 extends A031225 {

  /** Construct the sequence. */
  public A031275() {
    super(new A031269(), 0);
  }
}

