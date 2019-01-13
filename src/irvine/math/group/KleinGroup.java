package irvine.math.group;

import irvine.math.z.Z;

/**
 * Klein four group.
 * @author Sean A. Irvine
 */
public class KleinGroup extends DirectProduct<Z, Z> {

  private static final CyclicGroup C2 = new CyclicGroup(2);

  /**
   * Construct the Klein four group.
   */
  public KleinGroup() {
    super(C2, C2);
  }

  @Override
  public String toString() {
    return "V";
  }
}
