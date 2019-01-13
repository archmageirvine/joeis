package irvine.math.nauty;

/**
 * Level record.
 * @author Sean A. Irvine
 */
public class LevelRecord {
  int mFixedPt;       /* point that is fixed in this level */
  int mOrbitSize;     /* the size of the orbit containing mFixedPt */
  PermRecord mGens = null;     /* pointer to list of generators */
  CosetRecord[] mRepList = null; /* array of mOrbitSize representatives */
}
