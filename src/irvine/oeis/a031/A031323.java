package irvine.oeis.a031;

/**
 * A031323 Least k such that base 10 representation of n begins at s(k), where s=A031312.
 * @author Sean A. Irvine
 */
public class A031323 extends A031297 {

  /** Construct the sequence. */
  public A031323() {
    super(new A031312(), 0);
  }
}

