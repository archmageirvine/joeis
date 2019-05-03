package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A014576 Smallest n-digit narcissistic <code>(or Armstrong)</code> number: smallest n-digit number equal to sum of n-th powers of its digits <code>(or 0</code> if no such number <code>exists)</code>.
 * @author Sean A. Irvine
 */
public class A014576 extends FiniteSequence {

  /** Construct the sequence. */
  public A014576() {
    super(Z.ONE,
      Z.ZERO,
      new Z("153"),
      new Z("1634"),
      new Z("54748"),
      new Z("548834"),
      new Z("1741725"),
      new Z("24678050"),
      new Z("146511208"),
      new Z("4679307774"),
      new Z("32164049650"),
      Z.ZERO,
      Z.ZERO,
      new Z("28116440335967"),
      Z.ZERO,
      new Z("4338281769391370"),
      new Z("21897142587612075"),
      Z.ZERO,
      new Z("1517841543307505039"),
      new Z("63105425988599693916"),
      new Z("128468643043731391252"),
      Z.ZERO,
      new Z("21887696841122916288858"),
      new Z("174088005938065293023722"),
      new Z("1550475334214501539088894"),
      Z.ZERO,
      new Z("121204998563613372405438066"),
      Z.ZERO,
      new Z("14607640612971980372614873089"),
      Z.ZERO,
      new Z("1145037275765491025924292050346"),
      new Z("17333509997782249308725103962772"),
      new Z("186709961001538790100634132976990"),
      new Z("1122763285329372541592822900204593"),
      new Z("12639369517103790328947807201478392"),
      Z.ZERO,
      new Z("1219167219625434121569735803609966019"),
      new Z("12815792078366059955099770545296129367"),
      new Z("115132219018763992565095597973971522400")
      );
  }
}
