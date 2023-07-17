package irvine.oeis.a045;

/**
 * A045816 Number of times the digits are repeated in A045815.
 * @author Sean A. Irvine
 */
public class A045816 extends A045812 {

  /** Construct the sequence. */
  public A045816() {
    super(1);
  }

  @Override
  protected int base() {
    return 6;
  }
}

