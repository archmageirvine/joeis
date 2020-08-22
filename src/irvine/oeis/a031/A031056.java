package irvine.oeis.a031;

/**
 * A031056 a(n)=least k such that base 8 representation of n begins at s(k), where s=A031055.
 * @author Sean A. Irvine
 */
public class A031056 extends A031044 {

  /** Construct the sequence. */
  public A031056() {
    super(new A031055(), 0);
  }
}

