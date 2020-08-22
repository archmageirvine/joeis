package irvine.oeis.a031;

/**
 * A031309 a(n)=least k such that base 10 representation of n begins at s(k), where s=A031298.
 * @author Sean A. Irvine
 */
public class A031309 extends A031297 {

  /** Construct the sequence. */
  public A031309() {
    super(new A031298(), -1);
  }
}

