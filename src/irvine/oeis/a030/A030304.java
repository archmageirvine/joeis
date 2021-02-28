package irvine.oeis.a030;

/**
 * A030304 Least k such that base 2 representation of n begins at s(k), where s=A030190 (or equally A030302).
 * @author Sean A. Irvine
 */
public class A030304 extends A030320 {

  /** Construct the sequence. */
  public A030304() {
    super(new A030190(), -1);
  }

  @Override
  protected long first() {
    return -1;
  }
}
