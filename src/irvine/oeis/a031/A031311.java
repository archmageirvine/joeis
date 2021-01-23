package irvine.oeis.a031;

/**
 * A031311 a(n)=least k such that base 10 representation of n begins at s(k), where s=A031310.
 * @author Sean A. Irvine
 */
public class A031311 extends A031297 {

  /** Construct the sequence. */
  public A031311() {
    super(new A031310(), 0);
  }
}

