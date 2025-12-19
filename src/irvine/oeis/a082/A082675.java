package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082675 Constant term when a polynomial of degree &lt;= n is fitted to the first n+1 upper members of the twin prime pairs.
 * @author Sean A. Irvine
 */
public class A082675 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082675() {
    super(new A082674(), Z.TWO::add);
  }
}
