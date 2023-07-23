package irvine.oeis.a030;

/**
 * A030316 Least k such that the base-2 representation of n begins at s(k), where s=A030315.
 * @author Sean A. Irvine
 */
public class A030316 extends A030320 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A030316() {
    super(new A030315(), -1);
  }
}

