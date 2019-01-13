package irvine.math.nauty;

import java.io.Writer;

/**
 * Options.
 * @author B. D. McKay
 * @author Sean A. Irvine
 */
public class OptionBlk {

  //private static final int CONSOLWIDTH = 78;

  int mGetCanon;             /* make canong and canonlab? */
  //#define LABELONLY 2   /* new value UNIMPLEMENTED */
  boolean mDigraph;          /* multiple edges or loops? */
  //boolean mWriteAutoms;      /* write automorphisms? */
  boolean mWriteMarkers;     /* write stats on pts fixed, etc.? */
  boolean mDefaultPtn;       /* set lab,ptn,active for single cell? */
  //boolean mCartesian;        /* use mCartesian rep for writing automs? */
  //int mLineLength;           /* max chars/line (excl. '\n') for output */
  Writer mOutfile;            /* file for output, if any */
  //void (*userrefproc)       /* replacement for usual refine procedure */
  //   (graph*,int*,int*,int,int*,int*,set*,int*,int,int);
  UserAutomProc mUserAutomProc;     /* procedure called for each automorphism */
  UserLevelProc mUserLevelProc; /* procedure called for each level */
  UserNodeProc mUserNodeProc; /* procedure called for each node */
  InvarProc mInvarProc; /* procedure to compute vertex-invariant */
  int mTcLevel;             /* max level for smart target cell choosing */
  int mMinInvarLevel;        /* min level for invariant computation */
  int mMaxInvarLevel;        /* max level for invariant computation */
  int mInvarArg;             /* value passed to (*invariant)() */
  DispatchVec mDispatch = new NauGraph();    /* vector of object-specific routines */

  /**
   * Construct a new options block.
   */
  public OptionBlk() {
    mDefaultPtn = true;
    //mLineLength = CONSOLWIDTH;
    mTcLevel = 100;
    mMaxInvarLevel = 1;
  }

  /**
   * Set digraph handling to true
   * @param value digraph flag
   */
  public void setDigraph(final boolean value) {
    mDigraph = value;
  }

  /**
   * Set canonicalization level.
   * @param value level
   */
  public void setCanon(final int value) {
    mGetCanon = value;
  }
}
