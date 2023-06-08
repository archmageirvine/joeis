package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a002.A002260;
import irvine.oeis.triangle.Product;

/**
 * A131416 (A000012 * A002260) + (A002260 * A000012) - A000012.
 * @author Georg Fischer
 */
public class A131416 extends Combiner {

  /** Construct the sequence. */
  public A131416() {
    this(1, new A000012(), new A002260(), '+', new A002260(), new A000012());
  }

  /**
   * Generic constructor with parameters
   * @param seq1 first sequence
   * @param seq2 second sequence
   * @param oper operation: '+' or '-'
   * @param seq3 third sequence
   * @param seq4 fourth sequence
   */
  public A131416(final int offset, final Sequence seq1, final Sequence seq2, final char oper, final Sequence seq3, final Sequence seq4) {
    super(offset, new Product(seq1, seq2), new Product(seq3, seq4), oper == '+' ? ADD : SUBTRACT);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
